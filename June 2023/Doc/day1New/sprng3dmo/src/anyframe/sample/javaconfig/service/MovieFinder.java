package anyframe.sample.javaconfig.service;

import java.util.List;

import anyframe.sample.domain.Movie;

public interface MovieFinder {
	List<Movie> getPagingList(Movie movie, int pageIndex) throws Exception;
}
