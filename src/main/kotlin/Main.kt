import com.example.group401.API.APIClientRequest
import com.example.group401.API.VideoData
import API.VideoAPI
import API.VideoItemList

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val videoApi = VideoAPI()

    val videoItemList = videoApi.fetchRandomVideoData(200)
    // Fetch JSON data for a single random video
    if (videoItemList != null) {
        for (videoItem in videoItemList){
            println("Site URL: ${videoItem.site_url}")
            println("Video URL: ${videoItem.video_url}")
            println("Thumbnail: ${videoItem.thumb_nail}")
            println("Title: ${videoItem.title}")
            println("Duration: ${videoItem.duration}")
            println("Category: ${videoItem.category ?: "N/A"}")
            println("Available From: ${videoItem.available_from}")
            println("Available To: ${videoItem.available_to}")
            println("Is Child Friendly: ${videoItem.is_child_friendly}")
            println("Child Friendly: ${videoItem.child_friendly}")
            println("-----------------------------------")


        }
    }

    // Fetch JSON data for multiple random videos

}

val apiClient = APIClientRequest()