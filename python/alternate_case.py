def alternate_case(text: str) -> str:
    make_upper = True
    result = []
    for ch in text:
        if ch.isalpha():
            result.append(ch.upper() if make_upper else ch.lower())
            make_upper = not make_upper
        else:
            result.append(ch)
    return "".join(result)


if __name__ == "__main__":
    print(alternate_case("instagram"))   # InStAgRaM
    print(alternate_case("hello world")) # HeLlO wOrLd
    print(alternate_case("abc123def"))   # AbC123DeF
