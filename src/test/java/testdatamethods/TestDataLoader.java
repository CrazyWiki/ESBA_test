package testdatamethods;

import utils.JsonUtils;

public class TestDataLoader {
    public static final String TEST_DATA_PATH = JsonUtils.RESOURCES_PATH + "testdata/";
    private static final String TEST_DATA_FILE_PATH = TEST_DATA_PATH + "testData.json";

    public static TestData getTestData() {
        return JsonUtils.deserializeJson(TEST_DATA_FILE_PATH, TestData.class);
    }
}