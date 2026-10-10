#include <iostream>

int main(){
    int n;
    std::cin >> n;
    int result = n / 5;
    if(n >= 25){
        result += n/25;
    }
    if(n >= 125){
        result += n/125;
    }
    std::cout << result;
}