import Foundation

func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let N = readNumbers()[0]
    var S = Array(readTexts()[0])
    let Q = readNumbers()[0]
    
    let TABs = (0..<Q).map { _ in
        readNumbers()
    }
    TABs.forEach { tab in
        let T = tab[0]
        let A = tab[1]
        let B = tab[2]
        
        if T == 1 {
            let ca = S[Int(A - 1)]
            let cb = S[Int(B - 1)]
            S[Int(A - 1)] = cb
            S[Int(B - 1)] = ca
        } else {
            let head = S[0..<Int(N)]
            let tail = S[Int(N)..<Int(2*N)]
            S = Array(tail) + Array(head)
        }
    }

    print(String(S))
}

solve()
