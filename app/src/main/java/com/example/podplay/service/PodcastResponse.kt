package com.example.podplay.service

data class PodcastResponse(
    val resultCount: Int,
    val results: List<ItunesPodcast>) {

    data class ItunesPodcast(
        val collectionCensoredName: String,
        val feedUrl: String,
        val artworkUrl30: String,
        val releaseDate: String
    )
}

/*
{
    "resultCount": 7,
    "results": [
    {
        "wrapperType": "track",
        "kind": "podcast",
        "collectionId": 785545036,
        "trackId": 785545036,
        "artistName": "Android Developers",
        "collectionName": "Android Developers Backstage",
        "trackName": "Android Developers Backstage",
        "collectionCensoredName": "Android Developers Backstage",
        "trackCensoredName": "Android Developers Backstage",
        "collectionViewUrl": "https://podcasts.apple.com/us/podcast/android-developers-backstage/id785545036?uo=4",
        "feedUrl": "https://adbackstage.libsyn.com/rss",
        "trackViewUrl": "https://podcasts.apple.com/us/podcast/android-developers-backstage/id785545036?uo=4",
        "artworkUrl30": "https://is4-ssl.mzstatic.com/image/thumb/Podcasts125/v4/e7/d6/b9/e7d6b9b1-ab4c-f14e-5c83-e03bafba0bda/mza_3129999538968118035.png/30x30bb.jpg",
        "artworkUrl60": "https://is4-ssl.mzstatic.com/image/thumb/Podcasts125/v4/e7/d6/b9/e7d6b9b1-ab4c-f14e-5c83-e03bafba0bda/mza_3129999538968118035.png/60x60bb.jpg",
        "artworkUrl100": "https://is4-ssl.mzstatic.com/image/thumb/Podcasts125/v4/e7/d6/b9/e7d6b9b1-ab4c-f14e-5c83-e03bafba0bda/mza_3129999538968118035.png/100x100bb.jpg",
        "collectionPrice": 0.00,
        "trackPrice": 0.00,
        "trackRentalPrice": 0,
        "collectionHdPrice": 0,
        "trackHdPrice": 0,
        "trackHdRentalPrice": 0,
        "releaseDate": "2022-06-08T18:24:00Z",
        "collectionExplicitness": "cleaned",
        "trackExplicitness": "cleaned",
        "trackCount": 187,
        "country": "USA",
        "currency": "USD",
        "primaryGenreName": "Technology",
        "contentAdvisoryRating": "Clean",
        "artworkUrl600": "https://is4-ssl.mzstatic.com/image/thumb/Podcasts125/v4/e7/d6/b9/e7d6b9b1-ab4c-f14e-5c83-e03bafba0bda/mza_3129999538968118035.png/600x600bb.jpg",
        "genreIds": [
        "1318",
        "26",
        "1489",
        "1528"
        ],
        "genres": [
        "Technology",
        "Podcasts",
        "News",
        "Tech News"
        ]
    },
    {
        "wrapperType": "track",
        "kind": "podcast",
        "collectionId": 1473184049,
        "trackId": 1473184049..........
    }
  ....
}
        */
