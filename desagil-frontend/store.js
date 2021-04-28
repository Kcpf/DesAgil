import { configureStore } from '@reduxjs/toolkit';

import slices from './slices';

const inputs = Object.entries(slices);

const outputs = inputs.map(([k, v]) => [k, v.default.reducer]);

export default configureStore({
    reducer: Object.fromEntries(outputs),
});
