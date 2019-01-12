N = gets.chomp.to_i
A = (0...N).map do
  gets.to_i
end.sort

arr = []
(0...N).each do |i|
  if i % 2 == 0
    arr.push(A[0])
    A.delete_at(0)
  else
    arr.push(A[-1])
    A.delete_at(-1)
  end
end

sum = 0
(0...N-1).each do |i|
  sum += (arr[i] - arr[i+1]).abs
end

p arr
p sum
