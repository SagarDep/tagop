package com.akarbowy.tagop;

public interface Actions {
    String SEARCH_TAG = "search_tag";
    String FILTER_HISTORY_TAG = "filter_history_tag";
    String CLEAR_TAG_HISTORY = "clear_tag_history";

    void searchTag(String tag, int page);

    void filterHistory(String query);

    void clearHistory();
}