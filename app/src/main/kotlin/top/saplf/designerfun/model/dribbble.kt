package top.saplf.designerfun.model

import com.google.gson.annotations.SerializedName


/**
 * @author saplf
 */

private const val USER_TYPE = "Player"
private const val TEAM_TYPE = "Team"

data class User(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("name") val name: String = "",
  @SerializedName("username") val username: String = "",
  @SerializedName("html_url") val htmlUrl: String = "",
  @SerializedName("avatar_url") val avatarUrl: String = "",
  @SerializedName("bio") val bio: String = "",
  @SerializedName("location") val location: String = "",
  @SerializedName("links") val link: Link = Link(),
  @SerializedName("buckets_count") val bucketCount: Long = 0,
  @SerializedName("comments_received_count") val commentReceivedCount: Long = 0,
  @SerializedName("followers_count") val followerCount: Long = 0,
  @SerializedName("followings_count") val followingCount: Long = 0,
  @SerializedName("likes_count") val likeCount: Long = 0,
  @SerializedName("likes_received_count") val likeReceivedCount: Long = 0,
  @SerializedName("projects_count") val projectCount: Long = 0,
  @SerializedName("rebounds_received_count") val reboundReceivedCount: Long = 0,
  @SerializedName("shots_count") val shotCount: Long = 0,
  @SerializedName("teams_count") val teamCount: Long = 0,
  @SerializedName("can_upload_shot") val canUploadShot: Boolean = false,
  @SerializedName("type") val type: String = USER_TYPE,
  @SerializedName("pro") val pro: Boolean = false,
  @SerializedName("buckets_url") val bucketsUrl: String = "",
  @SerializedName("followers_url") val followersUrl: String = "",
  @SerializedName("following_url") val followingsUrl: String = "",
  @SerializedName("likes_url") val likesUrl: String = "",
  @SerializedName("shots_url") val shotsUrl: String = "",
  @SerializedName("teams_url") val teamsUrl: String = "",
  @SerializedName("created_at") val createdAt: String = "",
  @SerializedName("updated_at") val updatedAt: String = ""
)

data class Link(
  @SerializedName("web") val web: String = "",
  @SerializedName("twitter") val twitter: String = ""
)

data class Shot(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("title") val title: String = "",
  @SerializedName("description") val description: String = "",
  @SerializedName("width") val width: Int = 0,
  @SerializedName("height") val height: Int = 0,
  @SerializedName("images") val imageUrl: ImageUrl = ImageUrl(),
  @SerializedName("views_count") val viewCount: Int = 0,
  @SerializedName("likes_count") val likeCount: Int = 0,
  @SerializedName("comments_count") val commentCount: Long = 0,
  @SerializedName("attachments_count") val attachmentCount: Long = 0,
  @SerializedName("rebounds_count") val reboundCount: Long = 0,
  @SerializedName("buckets_count") val bucketCount: Long = 0,
  @SerializedName("created_at") val createdAt: String = "",
  @SerializedName("updated_at") val updatedAt: String = "",
  @SerializedName("html_url") val htmlUrl: String = "",
  @SerializedName("attachments_url") val attachmentsUrl: String = "",
  @SerializedName("buckets_url") val bucketsUrl: String = "",
  @SerializedName("comments_url") val commentsUrl: String = "",
  @SerializedName("likes_url") val likesUrl: String = "",
  @SerializedName("projects_url") val projectsUrl: String = "",
  @SerializedName("rebounds_url") val reboundsUrl: String = "",
  @SerializedName("animated") val animated: Boolean = false,
  @SerializedName("tags") val tags: List<String> = emptyList(),
  @SerializedName("user") val user: User = User(),
  @SerializedName("team") val team: Team = Team()
)

data class ImageUrl(
  @SerializedName("hidpi") val hidpi: String = "",
  @SerializedName("normal") val normal: String = "",
  @SerializedName("teaser") val teaser: String = ""
)

data class Team(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("name") val teamName: String = "",
  @SerializedName("username") val username: String = "",
  @SerializedName("html_url") val htmlUrl: String = "",
  @SerializedName("avatar_url") val avatarUrl: String = "",
  @SerializedName("bio") val bio: String = "",
  @SerializedName("location") val location: String = "",
  @SerializedName("links") val link: Link = Link(),
  @SerializedName("buckets_count") val bucketCount: Long = 0,
  @SerializedName("comments_received_count") val commentReceivedCount: Long = 0,
  @SerializedName("followers_count") val followerCount: Long = 0,
  @SerializedName("followings_count") val followingCount: Long = 0,
  @SerializedName("likes_count") val likeCount: Long = 0,
  @SerializedName("likes_received_count") val likeReceivedCount: Long = 0,
  @SerializedName("members_count") val memberCount: Long = 0,
  @SerializedName("projects_count") val projectCount: Long = 0,
  @SerializedName("rebounds_received_count") val reboundReceivedCount: Long = 0,
  @SerializedName("shots_count") val shotCount: Long = 0,
  @SerializedName("can_upload_shot") val canUploadShot: Boolean = false,
  @SerializedName("type") val type: String = TEAM_TYPE,
  @SerializedName("pro") val pro: Boolean = false,
  @SerializedName("buckets_url") val bucketsUrl: String = "",
  @SerializedName("followers_url") val followersUrl: String = "",
  @SerializedName("following_url") val followingUrl: String = "",
  @SerializedName("likes_url") val likesUrl: String = "",
  @SerializedName("members_url") val membersUrl: String = "",
  @SerializedName("shots_url") val shotsUrl: String = "",
  @SerializedName("team_shots_url") val teamShotsUrl: String = "",
  @SerializedName("created_at") val createdAt: String = "",
  @SerializedName("updated_at") val updatedAt: String = ""
)

data class Bucket(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("name") val name: String = "",
  @SerializedName("description") val description: String = "",
  @SerializedName("shots_count") val shotCount: Long = 0,
  @SerializedName("created_at") val createdAt: String = "",
  @SerializedName("updated_at") val updatedAt: String = "",
  @SerializedName("user") val user: User = User()
)

data class Project(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("name") val name: String = "",
  @SerializedName("description") val description: String = "",
  @SerializedName("shots_count") val shotCount: Long = 0,
  @SerializedName("created_at") val createdAt: String = "",
  @SerializedName("updated_at") val updatedAt: String = "",
  @SerializedName("user") val user: User = User()
)

data class Attachment(
  @SerializedName("id") val id: Long = 0,
  @SerializedName("url") val url: String = "",
  @SerializedName("thumbnail_url") val thumbnailUrl: String = "",
  @SerializedName("size") val size: Int = 0,
  @SerializedName("content_type") val contentType: String = "",
  @SerializedName("views_count") val viewsCount: Int = 0,
  @SerializedName("created_at") val createdAt: String = ""
)