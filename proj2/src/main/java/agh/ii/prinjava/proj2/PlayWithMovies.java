package agh.ii.prinjava.proj2;

import agh.ii.prinjava.proj2.dal.ImdbTop250;
import agh.ii.prinjava.proj2.model.Movie;
import agh.ii.prinjava.proj2.utils.Utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) { // test OK
        final Optional<List<Movie>> movies = ImdbTop250.movies();
        final Set<String> moviesByDirector = movies.orElseThrow().stream()
                .skip(1)
                .filter(m -> m.directors().contains(director))
                .map(m -> m.title())
                .collect(Collectors.toSet());
        return moviesByDirector;
    }

    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) { //test OK
        final Optional<List<Movie>> movies = ImdbTop250.movies();
        final Set<String> moviesByActor = movies.orElseThrow().stream()
                .skip(1)
                .filter(m -> m.actors().contains(actor))
                .map(m -> m.title())
                .collect(Collectors.toSet());
        return moviesByActor;
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() { //test OK
        //throw new RuntimeException("ex03 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Long> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::directors,
                                Collectors.counting()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(d -> {
                        if (map.containsKey(d)) {
                            map.put(d, map.get(d) + v);
                        } else {
                            map.put(d, v);
                        }
                    });
                });
        return map;
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() { //test OK
        //throw new RuntimeException("ex04 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Long> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::directors,
                                Collectors.counting()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(d -> {
                        if (map.containsKey(d)) {
                            map.put(d, map.get(d) + v);
                        } else {
                            map.put(d, v);
                        }
                    });
                });
        Stream<Map.Entry<String, Long>> new_stream =map.entrySet().stream();
        Map<String, Long> new_map = new HashMap<String, Long>();
        new_stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;
    }

    /**
     * Returns the movies (only titles) made by each of the 10 directors found in {@link PlayWithMovies#ex04 ex04}
     */
    static Map<String, Set<String>> ex05() { //test OK
        //throw new RuntimeException("ex05 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Set<String>> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::directors,
                                Collectors.toSet()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(d -> {
                        if (map.containsKey(d)) {
                            map.put(d, Stream.concat(v.stream().map(Movie::title).collect(Collectors.toSet()).stream(),map.get(d).stream()).collect(Collectors.toSet()));
                        } else {
                            map.put(d, v.stream().map(Movie::title).collect(Collectors.toSet()));
                        }
                    });
                });
        Stream<Map.Entry<String, Set<String>>> new_stream =map.entrySet().stream();
        Map<String, Set<String>> new_map = new HashMap<>();
        new_stream.sorted(Map.Entry.<String, Set<String>>comparingByValue((o1, o2) -> Integer.compare(o1.size(), o2.size())).reversed())
                .limit(10).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;
    }

    /**
     * Returns the number of movies per actor (as a map)
     */
    static Map<String, Long> ex06() { //test OK
        //throw new RuntimeException("ex06 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Long> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::actors,
                                Collectors.counting()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(d -> {
                        if (map.containsKey(d)) {
                            map.put(d, map.get(d) + v);
                        } else {
                            map.put(d, v);
                        }
                    });
                });
        return map;
    }

    /**
     * Returns the 9 actors with the most films on the list
     */
    static Map<String, Long> ex07() { //test OK
        //throw new RuntimeException("ex07 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Long> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::actors,
                                Collectors.counting()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(a -> {
                        if (map.containsKey(a)) {
                            map.put(a, map.get(a) + v);
                        } else {
                            map.put(a, v);
                        }
                    });
                });

        Stream<Map.Entry<String, Long>> new_stream =map.entrySet().stream();
        Map<String, Long> new_map = new HashMap<String, Long>();
        new_stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(9).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;
    }

    /**
     * Returns the movies (only titles) of each of the 9 actors from {@link PlayWithMovies#ex07 ex07}
     */
    static Map<String, Set<String>> ex08() { //test OK
        //throw new RuntimeException("ex08 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        final Set<List<Movie>> optMoviesSet = optMovies.stream().collect(Collectors.toSet());
        Map<String, Set<String>> map = new HashMap<>();
        optMovies.orElseThrow().stream()
                .collect(
                        Collectors.groupingBy(
                                Movie::actors,
                                Collectors.toSet()
                        )
                )
                .forEach((k, v) -> {
                    k.forEach(a -> {
                        if (map.containsKey(a)) {
                            map.put(a, Stream.concat(v.stream().map(Movie::title).collect(Collectors.toSet()).stream(),map.get(a).stream()).collect(Collectors.toSet()));
                        } else {
                            map.put(a, v.stream().map(Movie::title).collect(Collectors.toSet()));
                        }
                    });
                });
        Stream<Map.Entry<String, Set<String>>> new_stream =map.entrySet().stream();
        Map<String, Set<String>> new_map = new HashMap<>();
        new_stream.sorted(Map.Entry.<String, Set<String>>comparingByValue((o1, o2) -> Integer.compare(o1.size(), o2.size())).reversed())
                .limit(9).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;
    }

    /**
     * Returns the 5 most frequent actor partnerships (i.e., appearing together most often)
     */
    static Map<String, Long> ex09() { //test OK
        //throw new RuntimeException("ex09 is not implemented!");
        final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Long> mapMoviesPerActor = new HashMap<String, Long>();
        optMovies.orElseThrow().stream()
                .map(Movie::actors
                ).forEach((a) -> {
                    List<String> pairs = Utils.orderedPairsFrom(a);
                    pairs.forEach((e)->{
                        if (mapMoviesPerActor.containsKey(e)){
                            mapMoviesPerActor.put(e,mapMoviesPerActor.get(e)+1L);
                        }
                        else{
                            mapMoviesPerActor.put(e,1L);
                        }
                    });
                });

        Stream<Map.Entry<String, Long>> new_stream =mapMoviesPerActor.entrySet().stream();
        Map<String, Long> new_map = new HashMap<>();
        new_stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;
    }

    /**
     * Returns the movies (only titles) of each of the 5 most frequent actor partnerships
     */
    static List<Map.Entry<String, List<String>>> ex10() { //no finished
        throw new RuntimeException("ex10 is not implemented!");
        /*final Optional<List<Movie>> optMovies = ImdbTop250.movies();
        Map<String, Set<String>> mapMoviesPerActor = new HashMap<String, Set<String>>();
        optMovies.orElseThrow().stream()
                .map(Movie::actors)
                .forEach((a) -> {
                    List<String> pairs = Utils.orderedPairsFrom(a);
                    pairs.forEach((e)->{
                        if (mapMoviesPerActor.containsKey(e)){
                            mapMoviesPerActor.put(e, mapMoviesPerActor.get(e)+1L);
                        }
                        else{
                            mapMoviesPerActor.put(e,1L);
                        }
                    });
                });

        Stream<Map.Entry<String, Long>> new_stream =mapMoviesPerActor.entrySet().stream();
        Map<String, Long> new_map = new HashMap<>();
        new_stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5).forEach((e)->new_map.put(e.getKey(), e.getValue()));
        return new_map;*/
    }
}

