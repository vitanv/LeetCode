class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> set = new HashSet<>(Arrays.asList(folder));
        List<String> answer = new ArrayList<>();
        for(String file: folder){
            boolean subFolder = false;
            String prefix = file;
            while(!prefix.isEmpty()){
                int i = prefix.lastIndexOf('/');
                if(i == -1) break;
                prefix = prefix.substring(0, i);
                if(set.contains(prefix)){
                    subFolder = true;
                    break;
                }
            }
            if(!subFolder){
                answer.add(file);
            }
        }
        return answer;
    }
}