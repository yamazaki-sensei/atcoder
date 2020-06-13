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

B.solve()
