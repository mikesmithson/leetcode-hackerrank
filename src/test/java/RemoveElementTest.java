import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveElementTest {

    private RemoveElement removeElement = new RemoveElement();

    @Test
    void given_1_2_3_with_2_to_remove_return_2_and_1_3() {
        assertThat(removeElement.removeElement(new int[]{1,2,3}, 2)).isEqualTo(2);
        assertThat(removeElement.arrayContents()).isEqualTo(new int[]{1,3,3});
    }

}