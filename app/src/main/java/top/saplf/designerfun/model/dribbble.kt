package top.saplf.designerfun.model

import com.squareup.moshi.Json


/**
 * @author saplf
 */

private const val USER_TYPE = "Player"
private const val TEAM_TYPE = "Team"

data class User(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "name") val name: String = "",
  @Json(name = "username") val username: String = "",
  @Json(name = "html_url") val htmlUrl: String = "",
  @Json(name = "avatar_url") val avatarUrl: String = "",
  @Json(name = "bio") val bio: String = "",
  @Json(name = "location") val location: String = "",
  @Json(name = "links") val link: Link = Link(),
  @Json(name = "buckets_count") val bucketCount: Long = 0,
  @Json(name = "comments_received_count") val commentReceivedCount: Long = 0,
  @Json(name = "followers_count") val followerCount: Long = 0,
  @Json(name = "followings_count") val followingCount: Long = 0,
  @Json(name = "likes_count") val likeCount: Long = 0,
  @Json(name = "likes_received_count") val likeReceivedCount: Long = 0,
  @Json(name = "projects_count") val projectCount: Long = 0,
  @Json(name = "rebounds_received_count") val reboundReceivedCount: Long = 0,
  @Json(name = "shots_count") val shotCount: Long = 0,
  @Json(name = "teams_count") val teamCount: Long = 0,
  @Json(name = "can_upload_shot") val canUploadShot: Boolean = false,
  @Json(name = "type") val type: String = USER_TYPE,
  @Json(name = "pro") val pro: Boolean = false,
  @Json(name = "buckets_url") val bucketsUrl: String = "",
  @Json(name = "followers_url") val followersUrl: String = "",
  @Json(name = "following_url") val followingsUrl: String = "",
  @Json(name = "likes_url") val likesUrl: String = "",
  @Json(name = "shots_url") val shotsUrl: String = "",
  @Json(name = "teams_url") val teamsUrl: String = "",
  @Json(name = "created_at") val createdAt: String = "",
  @Json(name = "updated_at") val updatedAt: String = ""
)

data class Link(
  @Json(name = "web") val web: String = "",
  @Json(name = "twitter") val twitter: String = ""
)

data class Shot(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "title") val title: String = "",
  @Json(name = "description") val description: String = "",
  @Json(name = "width") val width: Int = 0,
  @Json(name = "height") val height: Int = 0,
  @Json(name = "images") val imageUrl: ImageUrl = ImageUrl(),
  @Json(name = "views_count") val viewCount: Int = 0,
  @Json(name = "likes_count") val likeCount: Int = 0,
  @Json(name = "comments_count") val commentCount: Long = 0,
  @Json(name = "attachments_count") val attachmentCount: Long = 0,
  @Json(name = "rebounds_count") val reboundCount: Long = 0,
  @Json(name = "buckets_count") val bucketCount: Long = 0,
  @Json(name = "created_at") val createdAt: String = "",
  @Json(name = "updated_at") val updatedAt: String = "",
  @Json(name = "html_url") val htmlUrl: String = "",
  @Json(name = "attachments_url") val attachmentsUrl: String = "",
  @Json(name = "buckets_url") val bucketsUrl: String = "",
  @Json(name = "comments_url") val commentsUrl: String = "",
  @Json(name = "likes_url") val likesUrl: String = "",
  @Json(name = "projects_url") val projectsUrl: String = "",
  @Json(name = "rebounds_url") val reboundsUrl: String = "",
  @Json(name = "animated") val animated: Boolean = false,
  @Json(name = "tags") val tags: List<String> = emptyList(),
  @Json(name = "user") val user: User = User(),
  @Json(name = "team") val team: Team = Team()
)

data class ImageUrl(
  @Json(name = "hidpi") val hidpi: String = "",
  @Json(name = "normal") val normal: String = "",
  @Json(name = "teaser") val teaser: String = ""
)

data class Team(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "name") val teamName: String = "",
  @Json(name = "username") val username: String = "",
  @Json(name = "html_url") val htmlUrl: String = "",
  @Json(name = "avatar_url") val avatarUrl: String = "",
  @Json(name = "bio") val bio: String = "",
  @Json(name = "location") val location: String = "",
  @Json(name = "links") val link: Link = Link(),
  @Json(name = "buckets_count") val bucketCount: Long = 0,
  @Json(name = "comments_received_count") val commentReceivedCount: Long = 0,
  @Json(name = "followers_count") val followerCount: Long = 0,
  @Json(name = "followings_count") val followingCount: Long = 0,
  @Json(name = "likes_count") val likeCount: Long = 0,
  @Json(name = "likes_received_count") val likeReceivedCount: Long = 0,
  @Json(name = "members_count") val memberCount: Long = 0,
  @Json(name = "projects_count") val projectCount: Long = 0,
  @Json(name = "rebounds_received_count") val reboundReceivedCount: Long = 0,
  @Json(name = "shots_count") val shotCount: Long = 0,
  @Json(name = "can_upload_shot") val canUploadShot: Boolean = false,
  @Json(name = "type") val type: String = TEAM_TYPE,
  @Json(name = "pro") val pro: Boolean = false,
  @Json(name = "buckets_url") val bucketsUrl: String = "",
  @Json(name = "followers_url") val followersUrl: String = "",
  @Json(name = "following_url") val followingUrl: String = "",
  @Json(name = "likes_url") val likesUrl: String = "",
  @Json(name = "members_url") val membersUrl: String = "",
  @Json(name = "shots_url") val shotsUrl: String = "",
  @Json(name = "team_shots_url") val teamShotsUrl: String = "",
  @Json(name = "created_at") val createdAt: String = "",
  @Json(name = "updated_at") val updatedAt: String = ""
)

data class Bucket(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "name") val name: String = "",
  @Json(name = "description") val description: String = "",
  @Json(name = "shots_count") val shotCount: Long = 0,
  @Json(name = "created_at") val createdAt: String = "",
  @Json(name = "updated_at") val updatedAt: String = "",
  @Json(name = "user") val user: User = User()
)

data class Project(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "name") val name: String = "",
  @Json(name = "description") val description: String = "",
  @Json(name = "shots_count") val shotCount: Long = 0,
  @Json(name = "created_at") val createdAt: String = "",
  @Json(name = "updated_at") val updatedAt: String = "",
  @Json(name = "user") val user: User = User()
)

data class Attachment(
  @Json(name = "id") val id: Long = 0,
  @Json(name = "url") val url: String = "",
  @Json(name = "thumbnail_url") val thumbnailUrl: String = "",
  @Json(name = "size") val size: Int = 0,
  @Json(name = "content_type") val contentType: String = "",
  @Json(name = "views_count") val viewsCount: Int = 0,
  @Json(name = "created_at") val createdAt: String = ""
)