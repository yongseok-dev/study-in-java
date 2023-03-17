package naverAPI;

// 네이버 검색 API 예제 - 블로그 검색
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiExamSearchBlog {
	final static String USER_TYPE_MSG = "영화를 검색해 보세요!\n >";

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(ApiExamSearchBlog.class.getResourceAsStream(".env"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String clientId = properties.getProperty("clientId"); // 애플리케이션 클라이언트 아이디
		String clientSecret = properties.getProperty("clientSecret"); // 애플리케이션 클라이언트 시크릿
		Scanner sc = new Scanner(System.in);
		String text = null;
		do {
			System.out.print(USER_TYPE_MSG);
			text = sc.nextLine();
		} while ("".equals(text));

		try {
			text = URLEncoder.encode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("검색어 인코딩 실패", e);
		}

		String apiURL = "https://openapi.naver.com/v1/search/movie?query=" + text; // JSON 결과

		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		String responseBody = get(apiURL, requestHeaders);

		output(responseBody);
	}

	private static void output(String responseBody) {
		JSONObject root = new JSONObject(responseBody);
		JSONArray items = root.getJSONArray("items");

		int total = root.getInt("total");
		int display = root.getInt("display");
		System.out.printf("검색결과: %d개 중 %d개 결과 입니다.\n", total, display);

		for (int i = 0; i < items.length(); i++) {
			JSONObject item = items.getJSONObject(i);
			String title = item.getString("title").replaceAll("<[^>]*>", "");
			String link = item.getString("link");
			String image = item.getString("image");

			System.out.printf("%d. %s\n - 링크: %s\n - 이미지: %s\n\n", i + 1, title, link, image);
		}

		System.out.println("\n이상 검색 결과 입니다");
	}

	private static String get(String apiUrl, Map<String, String> requestHeaders) {
		HttpURLConnection con = connect(apiUrl);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}

			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
				return readBody(con.getInputStream());
			} else { // 오류 발생
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	private static HttpURLConnection connect(String apiUrl) {
		try {
			URL url = new URL(apiUrl);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
		} catch (IOException e) {
			throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
		}
	}

	private static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);

		try (BufferedReader lineReader = new BufferedReader(streamReader)) {
			StringBuilder responseBody = new StringBuilder();

			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}

			return responseBody.toString();
		} catch (IOException e) {
			throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
		}
	}
}
