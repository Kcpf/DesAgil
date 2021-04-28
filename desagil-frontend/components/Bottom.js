import React from 'react';
import { TextInput, Button, StyleSheet } from 'react-native';

export default function Bottom(props) {
    return (
        <>
            <Button title={props.title}/>
            <TextInput defaultValue="Write Here"/>
        </>
    );
};

const styles = StyleSheet.create({
});