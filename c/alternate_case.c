#include <stdio.h>
#include <ctype.h>
#include <string.h>

int alternateCase(const char *input, char *output, size_t output_size) {
    int makeUpper = 1;
    size_t i;
    for (i = 0; input[i] != '\0'; i++) {
        if (i + 1 >= output_size) {
            return -1; /* output buffer too small */
        }
        if (isalpha((unsigned char)input[i])) {
            output[i] = makeUpper ? toupper((unsigned char)input[i])
                                  : tolower((unsigned char)input[i]);
            makeUpper = !makeUpper;
        } else {
            output[i] = input[i];
        }
    }
    output[i] = '\0';
    return 0;
}

int main(void) {
    char output[256];

    alternateCase("instagram", output, sizeof(output));
    printf("%s\n", output);  /* InStAgRaM */

    alternateCase("hello world", output, sizeof(output));
    printf("%s\n", output);  /* HeLlO wOrLd */

    alternateCase("abc123def", output, sizeof(output));
    printf("%s\n", output);  /* AbC123DeF */

    return 0;
}
