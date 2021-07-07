import Foundation

func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let S = readTexts()[0]
    var must = 0
    var possible = 0
    for (_, char) in S.enumerated() {
        if char == "o" {
            must += 1
        }
        if char == "?" {
            possible += 1
        }
    }
    
    var ans = 0
    let c = possible
    
    if must == 0 {
        ans = c * c * c * c
    } else if must == 1 {
        // must が 1箇所の場合
        ans += c * c * c * 4
        // must が 2箇所の場合
        ans += c * c * 6
        // must が 3箇所の場合
        ans += c * 4
        // must が 4箇所の場合
        ans += 1
    } else if must == 2 {
        // must が 2箇所の場合
        ans += c * c * 12
        // must が 3箇所の場合
        ans += c * ( 1 + 1 + 12)
        // must が 4箇所の場合
        ans += 16 - 4
    } else if must == 3 {
        // must が 3箇所で、他が possible の場合
        ans += 4 * 3 * 2 * c
        // must が 4箇所の場合
        ans += 81 - 3 * 16 - 3
    } else if must == 4 {
        ans = 24
    } else {
        ans = 0
    }
    
    print(ans)
}


solve()
