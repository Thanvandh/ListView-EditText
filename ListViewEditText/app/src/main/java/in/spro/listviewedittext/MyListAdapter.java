package in.spro.listviewedittext;

        import android.content.Context;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public MyListAdapter(Context context, String[] values) {
        super(context, R.layout.list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        final EditText editText = (EditText) rowView.findViewById(R.id.edit_text);

        editText.setText(values[position]);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                values[position] = editText.getText().toString();
            }
        });

        return rowView;
    }
}