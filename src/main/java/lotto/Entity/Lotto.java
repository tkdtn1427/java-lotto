package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private static final String STRING_TOKEN = ",";
    private static final int FIRST_NUMBER = 1;
    private static final int LAST_NUMBER = 45;
    private static final int PICK_NUMBER = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        overLapValidate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void overLapValidate(List<Integer> numbers){
        if(numbers.stream().collect(Collectors.toSet()).size() != 6)
            throw new IllegalArgumentException();
    }
}
