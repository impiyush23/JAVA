public class Video {
    private int videoId, views, totalVideos;
    private String title,likes;
    public void setVideoId(int videoId){
        this.videoId= videoId;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVideoId() {
        return videoId;
    }

    public int getViews() {
        return views;
    }

    public String getLikes() {
        return likes;
    }

    public int getTotalVideos() {
        return totalVideos;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Video v1 = new Video();
        v1.setVideoId(74);
        System.out.println(v1.getVideoId());
        v1.setTitle("|| HOW TO PUSH PROJECT ON GITHUB || 2024 || WINDOWS 11 || #newtrick " +
                "#windowsupdate #github #project");
        System.out.println(v1.getTitle());
        v1.setViews(230013);
        System.out.println(v1.getViews());
        v1.setLikes("23k");
        System.out.println(v1.getLikes());

    }
}
