NM = gets.chomp.split(' ')
N = NM[0].to_i
M = NM[1].to_i

AS = gets.chomp.split(' ').map{ |i| i.to_i }.sort

memo = {}
ans = 0

temp = []
AS.each do |i|
  AS.each do |j|
    temp.push(i + j)
  end
end

sorted = temp.sort.reverse

puts sorted.slice(0, M).reduce(:+)
