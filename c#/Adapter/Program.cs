using Adapter.Adapters;
using Adapter.Interfaces;
using Adapter.Models;
using System;
using System.Collections.Generic;

namespace Adapter
{
    class Program
    {
        /// <summary>
        /// The adapter pattern converts the class interface to another interface that the client is designed for.
        /// The adapter allows classes to work together, which is impossible under normal conditions due to
        /// the incompatibility of interfaces
        /// </summary>
        static void Main(string[] args)
        {
            IArcher ashe = new Ashe();

            IMage ahri = new Ahri();

            var mageClub = new List<IMage>();

            mageClub.Add(ahri);

            // mageClub.Add(ashe)(); ;(

            var mageAshe = new ArcherAdapter(ashe);

            mageClub.Add(mageAshe);

            foreach (var mage in mageClub)
            {
                mage.CastSpell();
            }

            Console.ReadKey();
        }
    }
}
