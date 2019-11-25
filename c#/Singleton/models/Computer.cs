namespace Singleton.models
{
    public class Computer
    {
        public OS OS { get; set; }

        public string Name { get; set; }

        public Computer()
        {
           
        }

        public void Launch(string osName)
        {
            OS = OS.GetInstance(osName);
        }
    }
}
