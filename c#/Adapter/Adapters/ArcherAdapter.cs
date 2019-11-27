using Adapter.Interfaces;
using System;
using System.Collections.Generic;
using System.Text;

namespace Adapter.Adapters
{
    public class ArcherAdapter : IMage
    {
        IArcher _archer;

        public ArcherAdapter(IArcher archer)
        {
            _archer = archer;
        }

        public void CastSpell()
        {
            _archer.LaunchArrow();
        }
    }
}
