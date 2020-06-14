class A {
    static func solve() {
        let S = readLine()!
        print(S.prefix(3))
    }
}

class B {

    static func solve() {
        let AV = readLine()!.split(separator: " ")
        let A = Int64(AV[0])!
        let V = Int64(AV[1])!
        let BW = readLine()!.split(separator: " ")
        let B = Int64(BW[0])!
        let W = Int64(BW[1])!
        let T = Int64(readLine()!)!

        let diff = abs(B - A)
        let diffPerSec = V - W
        if A == B {
            print("YES")
            return
        }
        if diffPerSec <= 0  {
            print("NO")
            return
        }

        if diff <= diffPerSec * T {
            print("YES")
        } else {
            print("NO")
        }
    }
}

class C {
    static func solve() {
        let NK = readLine()!.split(separator: " ")
        let N = Int(NK[0])!
        let K = Int(NK[1])!
        let As = readLine()!.split(separator: " ").map { Int($0)! }
        var affects = Array<Int>(repeating: 0, count: N)
        (0..<N).forEach { (i) in
            let A = As[i]
            (0..<N).forEach { (j) in
                var diff = abs(i - j)
                if diff > K {
                    diff = 0
                }
                print(diff)
                affects[i] += K - diff + A
            }
        }
        print(affects)
    }
}

C.solve()
