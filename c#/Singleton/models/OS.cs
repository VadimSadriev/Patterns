using System;

namespace Singleton.models
{
    public class OS
    {
        private static OS instance;

        private static object syncObj = new object();

        public string Name { get; set; }

        public OS(string name)
        {
            Name = name;
        }

        public static OS GetInstance(string name)
        {
            if (instance == null)
            {
                lock (syncObj)
                {
                    if (instance == null)
                    {
                        instance = new OS(name);
                    }
                }
            }

            return instance;
        }
    }
}
