NK = gets.chomp.split(' ')
N = NK[0].to_i
K = NK[1].to_i

RSP = gets.chomp.split(' ')
R = RSP[0].to_i
S = RSP[1].to_i
P = RSP[2].to_i

T = gets.chomp

i = 0
hands = ''
score = 0
T.each_char do |c|
  if c == 'r'
    if i - K >= 0 && hands[i - K] == 'p'
      if T[i + K] == 'r'
        hands += 'r'
      elsif T[i + K] == 's'
        hands += 's'
      elsif T[i + K] == 'p'
        hands += 'r'
      else
        hands += 'r'
      end
    else
      hands += 'p'
      score += P
    end
  elsif c == 's'
    if i - K >= 0 && hands[i - K] == 'r'
      if T[i + K] == 'r'
        hands += 's'
      elsif T[i + K] == 's'
        hands += 's'
      elsif T[i + K] == 'p'
        hands += 'p'
      else
        hands += 's'
      end
    else
      hands += 'r'
      score += R
    end
  elsif c == 'p'
    if i - K >= 0 && hands[i - K] == 's'
      if T[i + K] == 'r'
        hands += 'r'
      elsif T[i + K] == 's'
        hands += 'p'
      elsif T[i + K] == 'p'
        hands += 'p'
      else
        hands += 'p'
      end
    else
      hands += 's'
      score += S
    end
  end

  i += 1
end

puts score