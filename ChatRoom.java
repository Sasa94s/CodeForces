import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChatRoom {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
	}
	
	
	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			
			//start here
			String msg = in.next();
			String hello = "hello";
			int count = 0;
			LOOP:for (int i = 0; i < msg.length(); i++) {
				if((msg.charAt(i)==hello.charAt(count))){
					count++;
					if(count==5) break LOOP;
					//System.out.println("IM ALIVE at count "+count);
				}
			}
			if(count==5) System.out.println("YES");
			else System.out.println("NO");
				
		}

    }

	
	
	
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    
    }
    
    
    
    
}