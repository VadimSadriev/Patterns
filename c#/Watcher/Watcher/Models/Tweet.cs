namespace Watcher.Models
{
    public class Tweet
    {
        public string Theme { get; set; }
        public string Text { get; set; }

        public Tweet(string theme, string text)
        {
            Theme = theme;
            Text = text;
        }
    }
}