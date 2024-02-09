// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VideoGames.proto

// Protobuf Java Version: 4.26.0-rc2
package java_out;

public interface VideoGameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.VideoGame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the game
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the game
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of the game (default is GENERIC)
   * </pre>
   *
   * <code>.example.VideoGame.GameType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the game (default is GENERIC)
   * </pre>
   *
   * <code>.example.VideoGame.GameType type = 2;</code>
   * @return The type.
   */
  java_out.VideoGame.GameType getType();

  /**
   * <pre>
   * Release date of the game in the GameReleaseDate format created above
   * </pre>
   *
   * <code>.example.Date releaseDate = 3;</code>
   * @return Whether the releaseDate field is set.
   */
  boolean hasReleaseDate();
  /**
   * <pre>
   * Release date of the game in the GameReleaseDate format created above
   * </pre>
   *
   * <code>.example.Date releaseDate = 3;</code>
   * @return The releaseDate.
   */
  java_out.Date getReleaseDate();
  /**
   * <pre>
   * Release date of the game in the GameReleaseDate format created above
   * </pre>
   *
   * <code>.example.Date releaseDate = 3;</code>
   */
  java_out.DateOrBuilder getReleaseDateOrBuilder();

  /**
   * <pre>
   * List of match played
   * </pre>
   *
   * <code>repeated .example.VideoGame.Match matchPlayed = 4;</code>
   */
  java.util.List<java_out.VideoGame.Match> 
      getMatchPlayedList();
  /**
   * <pre>
   * List of match played
   * </pre>
   *
   * <code>repeated .example.VideoGame.Match matchPlayed = 4;</code>
   */
  java_out.VideoGame.Match getMatchPlayed(int index);
  /**
   * <pre>
   * List of match played
   * </pre>
   *
   * <code>repeated .example.VideoGame.Match matchPlayed = 4;</code>
   */
  int getMatchPlayedCount();
  /**
   * <pre>
   * List of match played
   * </pre>
   *
   * <code>repeated .example.VideoGame.Match matchPlayed = 4;</code>
   */
  java.util.List<? extends java_out.VideoGame.MatchOrBuilder> 
      getMatchPlayedOrBuilderList();
  /**
   * <pre>
   * List of match played
   * </pre>
   *
   * <code>repeated .example.VideoGame.Match matchPlayed = 4;</code>
   */
  java_out.VideoGame.MatchOrBuilder getMatchPlayedOrBuilder(
      int index);
}