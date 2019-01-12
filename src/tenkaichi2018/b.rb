s = gets.chomp!
A, B, K = s.split.map(&:to_i)

(0...K).each do |i|
  if i % 2 == 0
    if A % 2 == 1
      A -= 1
    end
    A = A / 2
    B += A
  else
    if B % 2 == 1
      B -= 1
    end
    B = B / 2
    A += B
  end
end

puts A.to_s + ' ' + B.to_s
