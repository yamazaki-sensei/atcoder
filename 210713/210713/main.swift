func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let N = readNumbers()[0]
    let As = readNumbers().map { x in
        x % 200
    }
}

solve()
