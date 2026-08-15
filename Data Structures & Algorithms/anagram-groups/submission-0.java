class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String text = strs[i];

            char[] charArray = text.toCharArray();

            Arrays.sort(charArray);

            String key = new String(charArray);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(text);
        }

        return new ArrayList<>(map.values());
    }
}