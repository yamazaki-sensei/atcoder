import Foundation

func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let S = readTexts()[0]
    let reversed = S.reversed()
    reversed.forEach { c in
        let char = String(c)
        if char != "6" && char != "9" {
            print(char, terminator: "")
        } else if char == "6" {
            print("9", terminator: "")
        } else {
            print("6", terminator: "")
        }
    }
    print("")
}


solve()
