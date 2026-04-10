<h2><a href="https://leetcode.com/problems/zigzag-conversion">6. Zigzag Conversion</a></h2><h3>Medium</h3><hr><p>The string <code>"PAYPALISHIRING"</code> is written in a zigzag pattern on a given number of rows like this (you may want to display this pattern in a fixed font for better legibility):</p>

<pre>
P   A   H   N
A P L S I I G
Y   I   R
</pre>

<p>And then read line by line: <code>"PAHNAPLSIIGYIR"</code></p>

<p>Write the code that will take a string and make this conversion given a number of rows:</p>

<pre><code>string convert(string s, int numRows);
</code></pre>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "PAYPALISHIRING", numRows = 3</span></p>
<p><strong>Output:</strong> <span class="example-io">"PAHNAPLSIIGYIR"</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "PAYPALISHIRING", numRows = 4</span></p>
<p><strong>Output:</strong> <span class="example-io">"PINALSIGYAHRPI"</span></p>
<p><strong>Explanation:</strong></p>

<pre>
P     I    N
A   L S  I G
Y A   H R
P     I
</pre>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "A", numRows = 1</span></p>
<p><strong>Output:</strong> <span class="example-io">"A"</span></p>
</div>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
<li><code>1 &lt;= s.length &lt;= 1000</code></li>
<li><code>s</code> consists of English letters (lower-case and upper-case), ',' and '.'.</li>
<li><code>1 &lt;= numRows &lt;= 1000</code></li>
</ul>