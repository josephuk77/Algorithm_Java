class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPw = db[i][1];

            if (inputId.equals(dbId) && inputPw.equals(dbPw)) {
                return "login";
            }

            if (inputId.equals(dbId)) {
                return "wrong pw";
            }
        }

        return "fail";
    }
}