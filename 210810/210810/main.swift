import Foundation

func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let RXY = readNumbers()
    
    let R = RXY[0]
    let X = RXY[1]
    let Y = RXY[2]
    
    let distance = Int64(ceil(sqrt(Double(X * X) + Double(Y * Y))))
    
    var count = distance / R
    
    if count == 0 {
        if distance % R != 0 {
            count += 2
        } else {
            count += 1
        }
    } else {
        if distance % R != 0 {
            count += 1
        }
    }

    print(count)

}

solve()
