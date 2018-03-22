package mm.test.islands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			throw new IllegalArgumentException("No file path provided.");
		}

		Path path = Paths.get(args[0]);

		if (!path.toFile().exists()) {
			throw new IllegalArgumentException("File does not exist.");
		}

		List<String> lines = Files.readAllLines(path);
		int[][] matrix = lines.stream().map(line -> Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray())
				.toArray(int[][]::new);

		long startTime = System.currentTimeMillis();
		IslandsCounter islandsCounter = new IslandsCounter();
		int islands = islandsCounter.count(matrix);
		long stopTime = System.currentTimeMillis();

		System.out.println("No of islands: " + islands + ", time: " + (stopTime - startTime) + " ms");
	}

}