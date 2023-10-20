/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    private String startHostname;
    private HashSet<String> visited = new HashSet<String>();

    private String getHostname(String url) {
        return url.split("/")[2];
    }

    private void dfs(String url, HtmlParser htmlParser) {
        visited.add(url);
        for (String nextUrl : htmlParser.getUrls(url)) {
            if (getHostname(nextUrl).equals(startHostname) && !visited.contains(nextUrl)) {
                dfs(nextUrl, htmlParser);
            }
        }
    }

    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        startHostname = getHostname(startUrl);
        dfs(startUrl, htmlParser);
        return new ArrayList<>(visited);
    }
}