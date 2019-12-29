abk = gets.chomp.split(' ').map { |s| s.to_i }
a = abk[0]
b = abk[1]
k = abk[2]

a_ans = [0, a - k].max
diff = [0, k - a].max
b_ans = [0, b - diff].max

puts "#{a_ans} #{b_ans}"
