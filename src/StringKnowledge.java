public class StringKnowledge {
    public static void main(String[] args) {
        String a = "ABc";
        String b = "abXabc";

        String toTest = "egg ham egg";

        System.out.println("endOther result: " + endOther(a, b));

        System.out.println("findRepeats result: " + findRepeats(toTest));
    }

    public static boolean endOther(String a, String b) {
        String workingA = a.toLowerCase();
        String workingB = b.toLowerCase();
        if (workingA.contains(workingB)) {
            return true;
        } else if (workingB.contains(workingA)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean findRepeats(String toTest) {
        String subString = "";
        for (int i = 0; i < toTest.length() - 1; i++) {
            subString = toTest.substring(i + 2);
            if (subString.contains(toTest.substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }
}
