#include <stdio.h>

int main(){
    char *s; // s == &s[0]
    char t;
    int a;

    scanf("%s", s);

    // 1 2 3 4 5 6
    // h e l l o \0
    printf("%s\n", s + 2);
    printf("%p\n", s);
    printf("%p\n", s + 1);
    printf("%c\n", *(s + 2));
}