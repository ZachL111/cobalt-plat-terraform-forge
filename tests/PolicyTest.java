package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(85, 77, 25, 11, 13);
        if (Policy.score(signalcase_1) != 96) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(82, 71, 23, 17, 8);
        if (Policy.score(signalcase_2) != 40) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(72, 81, 20, 20, 12);
        if (Policy.score(signalcase_3) != 29) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("review")) throw new AssertionError("decision mismatch");
    }
}
