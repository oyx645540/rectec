package com.ym.traegergill.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.tuya.smart.android.common.utils.L;
import com.ym.traegergill.R;
import com.ym.traegergill.bean.CountryViewBean;
import com.ym.traegergill.view.countrylist.ContactItemInterface;
import com.ym.traegergill.view.countrylist.ContactListAdapter;


import java.util.List;


public class CountryAdpater extends ContactListAdapter {
    private static final String TAG = "CountryAdpater";

    public CountryAdpater(Context _context, int _resource,
                          List<ContactItemInterface> _items) {
        super(_context, _resource, _items);
    }

    // override this for custom drawing
    public void populateDataForRow(View parentView, ContactItemInterface item, int position) {
        // default just draw the item only
        TextView fullNameView = (TextView) parentView.findViewById(R.id.nameView);

        if (item instanceof CountryViewBean) {
            CountryViewBean contactItem = (CountryViewBean) item;
            fullNameView.setText(contactItem.getCountryName());
            L.d(TAG, "countryItem" + fullNameView);
        }

    }

}
