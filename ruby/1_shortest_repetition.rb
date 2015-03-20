#!/usr/bin/ruby
# Read files: http://stackoverflow.com/questions/273262/best-practices-with-stdin-in-ruby/273841#273841

ARGF.each do |line|
    arr = line.scan(/(.+?)\1+/)[0]

    if arr
      puts arr[0].size
    else
      puts line.size-1
    end
end
