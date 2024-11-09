package Date_2024_11_09.generic.ex3;

import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> doghospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> cathospital = new AnimalHospitalV2<>();

        //이상한 ... 타입마저 생길 수 있다.
        //최소한 animal 혹은 그 자식 타입 인자로 제한을 하고 싶다면?
        AnimalHospitalV2<Integer> integerhospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objecthospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<String> stringhospital = new AnimalHospitalV2<>();


    }
}
