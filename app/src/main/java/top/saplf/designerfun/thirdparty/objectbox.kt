package top.saplf.designerfun.thirdparty

import io.objectbox.BoxStore
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import top.saplf.designerfun.App

/**
 * @author saplf
 */

@Entity data class BoxTest(
  @Id var id: Long = 0,
  var count: Long
)

val boxStore: BoxStore by lazy {
  MyObjectBox.builder()
    .androidContext(App.appContext)
    .build()
}
