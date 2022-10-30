package onboarding;

import java.util.*;

public class Problem7 {

    /**
     * user를 제외한 사용자 List를 구함
     * @param user
     * @param friends
     * @return
     */
    private static List<String> getUsersList(String user, List<List<String>> friends) {
        HashSet<String> users = new HashSet<>();

        for (List<String> next : friends) {
            if (!user.equals(next.get(0))) {
                users.add(next.get(0));
            }
            if (!user.equals(next.get(1))) {
                users.add(next.get(1));
            }
        }

        List<String> result = new ArrayList<>();
        for (String userName : users) {
            result.add(userName);
        }
        return result;
    }




    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> userList = getUsersList(user, friends);
        HashMap<String, HashSet<String>> userFriendsList = getEachFriendsList(friends);

        HashMap<String, Integer> userScore = new HashMap<>();
    }
}
