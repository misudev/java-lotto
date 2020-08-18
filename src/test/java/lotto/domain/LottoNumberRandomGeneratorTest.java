package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoNumberRandomGeneratorTest {

    private LottoNumberRandomGenerator lottoNumberRandomGenerator = new LottoNumberRandomGenerator();

    @Test
    @DisplayName("1~45번 중 여섯 개의 랜덤한 로또 번호를 추출한다.")
    void getNumbers_six_random_lotto_number() {
        // when
        List<LottoNumber> result = lottoNumberRandomGenerator.getNumbers(LottoConstants.LOTTO_SIZE);

        // then
        assertThat(result.size()).isEqualTo(LottoConstants.LOTTO_SIZE);
        result.forEach(number -> assertThat(number).isInstanceOf(LottoNumber.class));
    }
}