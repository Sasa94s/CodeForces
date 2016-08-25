import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Football {
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
			String formation = in.next();
			int count0=0, count1=0;
			for (int i = 1; i < formation.length(); i++) {
				if(count1<6)
					if(formation.charAt(i)=='1' && formation.charAt(i-1)=='1') count1++;
					else count1=0;
				else break;
				if(count0<6)
					if(formation.charAt(i)=='0' && formation.charAt(i-1)=='0') count0++;
					else count0=0;
				else break;
			}
			//System.out.println("IM ALIVE AT COUNT0 "+count0+", COUNT1 "+count1);
			if(count0>=6){
				out.print("YES");
			} else if(count1>=6){
				out.print("YES");
			} else out.print("NO");
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