package top.saplf.designerfun.net

import android.support.annotation.StringDef

/**
 * @author saplf
 */
object DribbbleParamAnn {

  /** [DribbbleApi.shots] list param **/
  const val LIST_ANIMATED = "animated"
  const val LIST_ATTACHMENTS = "attachments"
  const val LIST_DEBUTS = "debuts"
  const val LIST_PLAYOFFS = "playoffs"
  const val LIST_REBOUNDS = "rebounds"
  const val LIST_TEAMS = "teams"

  @Retention(AnnotationRetention.SOURCE)
  @StringDef(LIST_ANIMATED, LIST_ATTACHMENTS, LIST_DEBUTS, LIST_PLAYOFFS, LIST_REBOUNDS, LIST_TEAMS)
  annotation class ListType


  /** [DribbbleApi.shots] timeframe param **/
  const val TIME_WEEK = "week"
  const val TIME_MONTH = "month"
  const val TIME_YEAR = "year"
  const val TIME_EVER = "ever"

  @Retention(AnnotationRetention.SOURCE)
  @StringDef(TIME_WEEK, TIME_MONTH, TIME_YEAR, TIME_EVER)
  annotation class TimeFrameType


  /** [DribbbleApi.shots] sort param **/
  const val SORT_COMMENTS = "comment"
  const val SORT_RECENT = "recent"
  const val SORT_VIEWS = "views"

  @Retention(AnnotationRetention.SOURCE)
  @StringDef(SORT_COMMENTS, SORT_RECENT, SORT_VIEWS)
  annotation class SortType
}
